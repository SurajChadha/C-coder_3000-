#include <stdio.h>

int main() {

  void reverseQueue('queue'<int> &Queue)
  {
      stack<int> &Stack;
      while(!Queue.empty()){
          Stack.push(Queue.front());
          Queue.pop();
      }
  }
  while(!Stack.empty){
      Queue.push(Stack.top());
      Stack.pop();
  }
    return 0;
}