import { Injectable } from '@angular/core';
import { PADOLabsMessage } from '../models/padolabsChatMessage';

@Injectable({
  providedIn: 'root'
})
export class SocketService {

  private padolabsMessages: PADOLabsMessage[] = [];
  private socket: WebSocket | undefined;

  constructor() {}

  public getMessages(): PADOLabsMessage[] {
    return this.padolabsMessages;
  }

  public openConnection(){
    this.socket = new WebSocket("ws://localhost:7000/chat/Lucas");

    this.socket.onopen =(event) => {
      console.log(event)
    }

    this.socket.onmessage = (event) => {
      console.log(event.data);
      const padoMessage = JSON.parse(event.data);
      this.padolabsMessages.push(padoMessage);
    }

    this.socket.onclose = (event) => {
      console.log(event)
    }
  }

  public closeConnection(){
    this.socket?.close();
  }

  public sendMessage(padolabsMessages: PADOLabsMessage){
    this.socket?.send(JSON.stringify(padolabsMessages));

  }
}
