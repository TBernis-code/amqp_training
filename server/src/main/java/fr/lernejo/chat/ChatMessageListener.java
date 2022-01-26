package fr.lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {
    public final ChatMessageRepository chatMessageRepository;

    public ChatMessageListener(ChatMessageRepository chatMessageRepository) {
        this.chatMessageRepository = chatMessageRepository;
    }

    public void onMessage(String message){
        //System.out.println(message);
        this.chatMessageRepository.addChatMessage(message);
    }
}
