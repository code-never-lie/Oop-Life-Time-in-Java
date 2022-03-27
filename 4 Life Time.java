Life Time
- Time between allocation and deallocation of memory
- Life time depends on block
Example 1
{
int a=5;//life Time start
a++;
} //life time expire
..........................................
Example 2
  Student s;
   {Student t;
     t= new Student(); // Life Time Start
     s=t;
   }//garbage collector expires Student object

.........................................
- there is no delete keyword in java
- Garbage collector is responsible for all deletes

.................................................
Example 3

   {Student t;
     t= new Student(); // Life Time Start
     t= new Student();
     t= new Student();
     t= new Student();

   }//

...............................................
- We can request garbage collector to invoke
      
    System.gc();

................................................

Example 4

   {Student t;
     t= new Student(); // Life Time Start
     System.gc();
     t= new Student();
     t= new Student();
     System.gc();
     t= new Student();

   }//

.............................................
Destructors in java
..................................................
- no explicit destructors as c++
- finalize method can be written

 protected finalize() {}

Example 

class Car{
String make;
Car (String m){make=m;}
String getMake() { return make;}
void setMake(String m){make=m;}
protected finalize(){
// action on expiry

}

}
.............................................
Problem with Pointers

1- Garbage (Memory Leakage)
  c++
    Student *t;
     t= new Student(); // Life Time Start
     t= new Student();
     t= new Student();
     t= new Student();
 
- not possible in java

2- Dangling Reference
  c++ 
   Student *c1=new Student();
   Student *c2=c1;
   delete c2;
   c1->getName(); // Dangling ref
- not possible in java
............................................






















