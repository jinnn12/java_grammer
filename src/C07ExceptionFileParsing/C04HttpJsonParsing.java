package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.*;
import java.io.*;
import java.util.*;

public class C04HttpJsonParsing {

    public static void main(String[] args) throws IOException, InterruptedException {
//        외부데이터(api) 요청 : 서버 간 통신
//        RestTemplate, RestClient : 스프링에서 가장 많이 사용하는 라이브러리
        ObjectMapper o1 = new ObjectMapper();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String postString = response.body();
//        System.out.println(postString);

//        post 객체에 넣기
//        일단 리스트로 만들면되지않을가??

        List<Post> postList = new ArrayList<>();
        JsonNode jsonNodes = o1.readTree(postString);
        for (JsonNode n : jsonNodes) {
            Post post = o1.readValue(n.toString(), Post.class);
            postList.add(post);
        }
        System.out.println(postList);

    }
}
class Post {
//        "기본생성자 + getter" 필수 / private인데 어떻게 접근? -> 런타임 시점에 자바에서
    private long userId;
    private long id;
    private String title;
    private String body;

    public long getUserId() {
        return userId;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
