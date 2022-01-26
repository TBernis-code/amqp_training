package fr.lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChatMessageRepository {
    public final List<String> list = new ArrayList<>();

    public void addChatMessage(String message){
        list.add(message);
    }

    public List<String> getLastTenMessages(){
        try {
            //récupère la 90 à 100 si la taille de la liste est 10
            return list.subList(list.size() - 10, list.size());
        } catch (IndexOutOfBoundsException ex) {
            return list;
        }
    }
}
