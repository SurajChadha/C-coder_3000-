#include <iostream>
using namespace std;

struct node* Search(struct node* root,int key)
if(root==NULL || root->key == key)
return root;

if(root->key<key)
  return search(root->right,key);
return search(root-left,key);