public class AnimalList {
    private AnimalListItem head;

    public AnimalList(AnimalListItem head) {
        this.head = head;
    }

    public void next(AnimalListItem item){
      if(head.getNext() == null) {
          head.setNext(item);
          return;
    }

      AnimalListItem nextItem = head.getNext();
      //letztes glied in der kette
        while (nextItem.getNext() != null) {
            nextItem = nextItem.getNext();
        }
        nextItem.setNext(item);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AnimalList = " + head);
        stringBuilder.append(" || " + head.getNext());
        return stringBuilder.toString();
    }
}

