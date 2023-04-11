package src;

class LinkedList<T extends Comparable<T>> implements Lista<T> {
        private Node head= null;
        @Override
        public T get(int position) {
            Node coso=head;
            T respuesta=null;
            for(int indice=0;coso!=null;indice++){
            if(indice==position){
                 respuesta= (T) coso.data;
            }
                coso=coso.next;
            }
            return respuesta;
        }


        @Override
        public void add(T value) {

            Node aAñadir = new Node();
            aAñadir.data = value;
            aAñadir.next = null;
            if (head==null){
                head=aAñadir;
            }
            else{
                Node coso=head;
                while (coso.next!= null) {
                    coso=coso.next;
                }
                coso.next=aAñadir;
            }}

        @Override
        public void remove(int position) {
            Node coso=head;
            if(position==0){
                head=head.next;
            }
            else{
            for(int indice=0;coso!=null;indice++){
                if (indice==position-1){
                    coso.next=coso.next.next;
                    break;
                }
                coso=coso.next;

            }


        }}
        public boolean seEncuentra(T data){
            Node coso = head;
            boolean esta=false;
            while(coso!=null){
                if(coso.data==data){
                    esta=true;
                }
                coso=coso.next;
            }
            return esta;
        }
        public void addFirst(T value){
            Node nuevo= new Node();
            //nuevo.data= value;
            nuevo.next=head;
            head=nuevo;
        }
        public void addLast(T value){
            Node ultimo= new Node();
            ultimo.data= value;
            ultimo.next=null;
            Node coso=head;
            while(coso!=null){
                if(coso.next==null){
                    coso.next=ultimo;
                    break;
                }
                coso=coso.next;
            }
        }
        public void agregarEnOrden(T value){
            Node nuevo= new Node();
            nuevo.data=value;
            Node coso=head;
            // ASI SE HACE if (coso.data.compareTo(value)==-1) 1 es falso 0 es verdadero y -1 iguales
            if(coso==null|| coso.data.compareTo(value)>0){ //esto es solo el primero
                nuevo.next=head;
                head=nuevo;
            }
            else {
                if(coso.next.data.compareTo(value)>0){
                    nuevo.next=coso.next;
                    coso.next=nuevo;
                }
                coso=coso.next;
                if(coso.next==null){
                    if(coso.data.compareTo(value)>0){
                        nuevo.next=coso;
                        coso.next=nuevo;
                    }
                    else{
                        coso.next=nuevo;
                        nuevo.next=null;
                    }
                }


            }
             }
        public static void main(String [] args){
            LinkedList listita = new LinkedList();
            listita.agregarEnOrden(4);
            listita.agregarEnOrden(3);
            listita.agregarEnOrden(1);
            listita.agregarEnOrden(2);
            listita.agregarEnOrden(5);


        }


    }

