import com.example.designpatterns.decorator.base.Notifier;
import com.example.designpatterns.decorator.impl.BasicNotifier;
import com.example.designpatterns.decorator.impl.EmailNotifier;
import com.example.designpatterns.decorator.impl.PushNotifier;
import com.example.designpatterns.decorator.impl.SMSNotifier;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new BasicNotifier();
        notifier = new EmailNotifier(notifier);
        notifier = new SMSNotifier(notifier);
        notifier = new PushNotifier(notifier);
        notifier.send("You have a new message!");
    }
}