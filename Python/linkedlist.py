class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insert(self, data):
        current = self.head
        new_node = Node(data)
        if(self.head):
            while(current.next):
                current = current.next
            current.next = new_node
        else:
            self.head = new_node

    def append(self, data):
        new_node = Node(data)
        if (self.head == None):
            self.head = new_node
            return
        
        last = self.head
        while(last.next):
            last = last.next
        
        last.next = new_node


    def push(self, new_data):
        new_node = Node(new_data)
        new_node.next = self.head
        self.head = new_node
    
    def reverse(self):
        prev = None
        current = self.head
        while(current != None):
            next = current.next
            current.next = prev
            prev = current
            current = next
        self.head = prev

    def printList(self):
        temp = self.head
        while(temp):
            print (temp.data),
            print("->"),
            temp = temp.next
        print(None)

mylist = LinkedList()

mylist.insert(20)
mylist.append(4)
mylist.append(15)
mylist.append(81)
mylist.printList()
mylist.reverse()
mylist.printList()
