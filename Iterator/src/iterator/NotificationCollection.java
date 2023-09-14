package iterator;

public class NotificationCollection implements Collection {

static final int MAX_ITEMS = 6;
int numberOfItems = 0;
Notificaction[] notificactionList;

public NotificationCollection() {
    notificactionList = new Notificaction[MAX_ITEMS];
    addItem("Notification 1");
    addItem("Notification 2");
    addItem("Notification 3");
}
public void addItem(String str) {
    Notificaction notificaction = new Notificaction(str);
    if (numberOfItems >= MAX_ITEMS){
        System.err.println("full");
    } else {
    notificactionList[numberOfItems] = notificaction;
    numberOfItems = numberOfItems + 1;
    }
}
public Iterator createIterator(){
    return new NotificationIterator(notificactionList);
}
}