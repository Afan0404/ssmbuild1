import com.chen.pojo.Books;
import com.chen.pojo.User;
import com.chen.service.BookServiceImpl;
import com.chen.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void getBooks(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = context.getBean("BookServiceImpl", BookServiceImpl.class);
        bookServiceImpl.addBook(new Books(6,"雪中悍刀行",111,"666"));
    }
    @Test
    public void getUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = context.getBean("UserServiceImpl", UserServiceImpl.class);
        int id1=1;
        System.out.println(userServiceImpl.idTest(id1));
    }
}
