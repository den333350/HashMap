package org.project;



public class HashMap<K,V> {
    private Node<K,V> first;
    private Node<K,V> last;


    public boolean containsKey(K key){
       Node <K,V> current = first;
       while(true){
           if(current.key.equals(key)) return true;
           if(current.equals(last)) return false;
           current = current.nextNode;
       }
    }

    public V put(K key,V value){
        Node<K,V> node = new Node<K,V>();
        node.key = key;
        node.value = value;

        if(first==null){
            first = last = node;
            return null;
        }
        else {
            if(containsKey(key)){
                Node <K,V> current = first;
                while(true){
                    if(current.key.equals(key)){
                        current=node;
                        return value;
                    }
                    current = current.nextNode;
                }
            }else{

                last.nextNode= node;
                last = node;
                return null;
            }

        }
    }
    public V get(K key){
        if(containsKey(key)){
            Node <K,V> current = first;
            while(true){
                if(current.key.equals(key)){
                    return current.value;
                }
                current = current.nextNode;
            }
        }else
        return null;
    }



    private class Node<K,V>{
        private K key;
        private V value;
        private Node nextNode;

    }

}
