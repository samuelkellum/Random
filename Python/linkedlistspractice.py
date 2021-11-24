class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
    
    def getSizeRec(self, currentNode):
        if (not currentNode):
            return 0
        else:
            return 1 + self.getSizeRec(currentNode.next)
    
    def getSize(self):
        return self.getSizeRec(self.head)

    
    def insertAtHead(self, data):
        newHead = Node(data)
        if self.head == None:
            self.head = newHead
        else:
            oldHead = self.head
            self.head = newHead
            newHead.next = oldHead
    
    def insertAtTail(self, data):
        newTail = Node(data)
        if self.head == None:
            self.head = newTail
        else:
            currentNode = self.head
            while(currentNode.next):
                currentNode = currentNode.next
            currentNode.next = newTail

            

    def printLinkedList(self):
        temp = self.head
        while(temp):
            print (temp.data),
            print("->"),
            temp = temp.next
        print(None)

myList = LinkedList()

myList.insertAtTail(1123)
myList.insertAtTail(4321)
x = myList.getSize()
print(x)
myList.printLinkedList()


