import ru.netology.domain.PosterObject;

public class PosterManager {

    private PosterObject[] objects = new PosterObject[0];
    public int limit;


    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }


    public int getLimit() {
        return limit;
    }

    public void setResultLength(int limit) {
        this.limit = limit;
    }


    public void save(PosterObject object) {
        PosterObject[] tmp = new PosterObject[objects.length + 1];
        for (int i = 0; i < objects.length; i++) {
            tmp[i] = objects[i];
        }
        tmp[tmp.length - 1] = object;
        objects = tmp;

    }

    public PosterObject[] getObject() {
        return objects;
    }

    public void add(PosterObject object) {
        save(object);
    }

    public PosterObject[] getObjects() {
        PosterObject[] findAll = getObject();
        PosterObject[] reversed = new PosterObject[findAll.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = findAll[findAll.length - 1 - i];
        }
        return reversed;
    }

    public PosterObject[] findLast() {
        int resultLength;
        if (objects.length < limit) {
            resultLength = objects.length;
        } else {
            resultLength = limit;
        }
        PosterObject[] tmp = new PosterObject[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = objects[objects.length - 1 - i];
        }
        return tmp;
    }
}

