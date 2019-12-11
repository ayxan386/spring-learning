package app.controller;

import app.entity.Message;
import app.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msg")
public class MessageController {
  private final MessageService messageService;

  @Autowired
  public MessageController(MessageService messageService) {
    this.messageService = messageService;
  }

  @GetMapping("{id}")
  public Message handle_get(@PathVariable("id") int id) {
    return messageService.get_one(id);
  }

  @GetMapping
  public Iterable<Message> handle_get_all() {
    return messageService.get_all();
  }

  @PostMapping
  public Message handle_post(@RequestBody Message message) {
    return messageService.save_one(message);
  }

}
