import { Component, OnDestroy, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { PADOLabsMessage } from '../models/padolabsChatMessage';
import { SocketService } from '../services/socket.service';

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.scss']
})
export class ChatComponent implements OnInit, OnDestroy {

  protected socketService: SocketService;

  constructor(socketService: SocketService) { 
    this.socketService = socketService;
  }

  ngOnInit(): void {
    this.socketService.openConnection()
  }

  ngOnDestroy(): void {
    this.socketService.closeConnection()
  }

  public sendMessage(sendForm: NgForm){
    const padolabsMessages = new PADOLabsMessage(sendForm.value.user, sendForm.value.message);
    this.socketService.sendMessage(padolabsMessages);
    sendForm.controls['message'].reset();
  }

}
