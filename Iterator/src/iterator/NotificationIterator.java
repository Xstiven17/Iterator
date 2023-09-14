package iterator;

public class NotificationIterator implements Iterator {

    Notificaction[] notificationList;

    int  pos = 0;

    public NotificationIterator( 
        Notificaction[] notificationList) {
            this.notificationList = notificationList;
        }

        public Object next() {
            Notificaction notificaction = notificationList[pos];
            pos += 1;
            return notificaction;
        }

        public boolean hasNext() {
            if (pos >= notificationList.length ||
            notificationList[pos] == null) {
                return false;
            } else {
                return true;
            }
        }
}
