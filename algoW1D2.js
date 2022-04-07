class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class SLL {
    constructor() {
        this.head = null;
    }

    isEmpty() {
        if (!this.head) {
            return true;
        }
        else {
            return false;
        }
    }

    // when a pointer is to the LEFT of an equal sign, we are CHANGING it
    // when a pointer is to the RIGHT of an equal sign, we are READING it

    // add given node to the head, if it exists. return void
    // list is empty?
    // list already has nodes?
    addToFront(node) {
        if (this.isEmpty()) {
            this.head = node;
        }
        else {
            node.next = this.head;
            this.head = node;
        }
    }

    // create a new node with given data, add it to the head. return void
    addDataToFront(data) {
        this.head.value = data;
    }


    read() {
        var runner = this.head;
        while (runner) {
            // how to move the runner
            console.log(runner.value);
            runner = runner.next;
        }
    }

    contains(value) {
        var runner = this.head;

        while (runner.next) {
            if (runner.value == value) {
                return true;
            }
            // how to move the runner
            runner = runner.next;
        }
    }


    // remove and return the first node
    removeFromFront() {
        var runner = this.head;
        this.head = this.head.next;
        runner.next = null;
        return runner;
    }


    delete(value){
        var runner = this.head;
        var toDelete = null;

        if (this.head.value == value){
            toDelete = runner;
            this.head = this.head.next;
            return toDelete;
        }

        while(runner.next){
            if (runner.next.value == value){
                toDelete = runner.next;
                runner.next = runner.next.next;
            }
            runner = runner.next;
        }

        return toDelete;
    }
}

// instantiate the SLL
var myCoolSLL = new SLL();

console.log(myCoolSLL.isEmpty());

// creating nodes
// var myNode = new Node(55);

// executing methods:
myCoolSLL.addToFront(new Node(55));
myCoolSLL.addToFront(new Node(100));
myCoolSLL.addDataToFront(543);

// myCoolSLL.removeFromFront();

myCoolSLL.addToFront(new Node(100));
myCoolSLL.addToFront(new Node(44));
myCoolSLL.addToFront(new Node(33));
// myCoolSLL.addToFront(new Node(22));
// console.log(myCoolSLL.head.next.next.value);
console.log(myCoolSLL.delete(33));
myCoolSLL.read();
