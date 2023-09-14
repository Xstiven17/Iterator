package iterator;

public class NotificationBar {
  NotificactionCollection notificactions;
  
  public NotificactionBar(){
    this.notificactions = new NotificationCollection();
 }

 public void printNotification(){
    Iterator iterator = notificactions.createIterator();
    System.out.println("----------NOTIFICATION BAR-----------------");
 while (iterator.hasNext()) {
    Notificaction n = (Notificaction) iterator.next();
    System.out.println(n.getNotification());

 }
}
}
