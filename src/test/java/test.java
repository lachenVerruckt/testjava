import com.example.entity.User;

import com.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Scanner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class test {

    @Autowired
    private UserService userService;


    @Test
    public void testSystem() {
        boolean i = true;
        Scanner scanner = new Scanner(System.in);
        while (i) {
            prompt();
            String next = scanner.next();


            switch (next) {
                case "1":
                    queryUser();
                    break;
                case "2":
                    addUser();
                    break;



                case "5":
                    i=false;
                    break;
                default:
                    System.out.println("请输入正确的选择");


            }
        }

    }
    @Test
    public void prompt() {
        System.out.println("欢迎使用:");
        System.out.println("输入 1查看用户 2添加 3删除 4修改 5退出");
    }

    @Test
    public void queryUser() {
        List<User> user = userService.getUser();
        for (User user1 : user) {
            System.out.println(user1);
        }
    }
    @Test
    public void addUser() {
        User user = new User();
        user.setName("大佬的");
        user.setPassword("199107");
        int a=0;
        List<Integer> integers = userService.queryAllID();
        for (Integer integer : integers) {
            if (integer>a){
                a=integer+1;
            }
        }
        user.setId(a);
        int affectedNumber = userService.addUser(user);
        if (affectedNumber > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }



}
