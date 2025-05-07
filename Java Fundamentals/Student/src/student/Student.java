//Essa classe irá definir uma pessoa e suas informações e através de sub-tarefas chamar retornar essas informações sempre que for nescessario
package student;


public class Student {
    private int age;  //declarando variavel como age como int 
    private String name; //declarando variavel name como string(texto)
    public void setPersonage(String name, int age){ // inciando metodo para setar nome e idade da pessoa
     this.age = age;                    //atribui a idade do passado ao atributo da classe   
     this.name = name;                 //atribui o nome passado ao atributo da classe
     
    }
    public String getname(){ //inciando o metod para retornar o nome do aluno
     return name;
     
    }
    public int getPersonage(){ //iniciando metodo para retornar a idade do aluno 
     return age;
     
    }
    
    public static void main(String[] args) {
  
        // Cria um novo objeto da classe Student
        Student student1 = new Student();
        Student student2 = new Student();

        // Define o nome e a idade do estudante
        student1.setPersonage( "João" ,18);
        student2.setPersonage("Julia", 18);

        // Imprime o nome do estudante usando o método getName()
        System.out.println("Nome: " + student1.getname());

        // Imprime a idade do estudante usando o método getPersonAge()
        System.out.println("Idade: " + student1.getPersonage());
        
        if(student1.getPersonage() == student2.getPersonage()){
            System.out.println(student1.getname() + " tem a mesma idade que " + student2.getname());
        }
        else{
            System.out.println(student1.getname() + " Não tem a mesma idade " + student2.getname());
        }
    }
    
}
//usar  subtarefa chamada getname() que irá retorar o nome da pessoa
//usar subtarefa getpersonage() que irá retornar a idade da pessoa 
//usar subtarefa  setpersonage() que irá setar a idade da pessoa