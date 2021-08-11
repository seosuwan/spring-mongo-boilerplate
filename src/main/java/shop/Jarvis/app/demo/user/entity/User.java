package shop.Jarvis.app.demo.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;

    @Override
    public String toString() {
        return "회원명세{" +
                "아이디='" + id + '\'' +
                ", 이름='" + name + '\'' +
                ", 이메일='" + email + '\'' +
                ", 비밀번호='" + password + '\'' +
                '}';
    }
}
