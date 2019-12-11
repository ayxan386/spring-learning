package app.service;

import app.entity.Message;
import app.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

  private final MessageRepository messageRepository;

  @Autowired
  public MessageService(MessageRepository messageRepository) {
    this.messageRepository = messageRepository;
  }

  public Message get_one(int id) {
    return messageRepository.findById(id).orElse(null);
  }

  public Message save_one(Message message) {
    System.out.println(message);
    return messageRepository.save(message);
  }

  public Iterable<Message> get_all() {
    return messageRepository.findAll();
  }
}
