public class IntVector implements IntList {
    private int[] data = new int[20];
    private int size = 0;

    @Override
    public void add(int number) {
        if (size == data.length) {
            int newSize = data.length * 2;
            int [] newData = new int[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;

        }
        data[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) throw new IndexOutOfBoundsException(" Index out of range ");
        return data[id];
    }
}
