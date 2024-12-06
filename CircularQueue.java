// "static void main" must be defined in a public class.

class CircularQueue {

    int front, back;
    int[] arr;
    int length;

    public CircularQueue(int n) {
        front = -1;
        back = -1;
        length = 0;
        arr = new int[n];
    }

    void push(int val) {
        if (this.length < arr.length) {
            if (back == -1) {
                front = 0;
            }
            back = (back + 1) % arr.length;
            arr[back] = val;
            this.length++;
        }
    }

    int pop() {
        if (this.length > 0) {
            if (front == back) {
                int idx = front;
                this.length--;
                front = -1;
                back = -1;
                return arr[idx];
            } else {
                int idx = front;
                front = (front + 1) % arr.length;
                this.length--;
                return arr[idx];
            }
        }
        return -1;
    }
}
// [23, 43, 2, 34, 3, 23]
//  [0, 0, 0, 0, 0] // size = 5
//
