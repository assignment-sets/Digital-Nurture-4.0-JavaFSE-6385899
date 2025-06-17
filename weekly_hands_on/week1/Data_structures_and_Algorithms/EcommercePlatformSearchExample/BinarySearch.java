public class BinarySearch<T extends Product> {
    public int search(T[] arr, T target, int l, int r) {
        if (l > r)
            return -1;
        int mid = (l + r) / 2;
        if (arr[mid].equals(target)) {
            return mid;
        } else if (arr[mid].getProductId() < target.getProductId()) {
            return search(arr, target, mid + 1, r);
        } else {
            return search(arr, target, l, mid - 1);
        }
    }
}
