### Play Dialogue Mongo DB document Structure
Below is a sample document which will be stored in MongoDB. 
This structure is subject to change to improve performance for streaming the dialogue in kafka.
```json
 {
  "playName" : "The Darker Times",
  "author" : "Asmodeus",
  "actNumber": "1",
  "sceneSetting" : "The courtroom is gloomy after the raise of the demon armies and its first attack on the Kingdom's outskirts",
  "charactersInScene" : "The King, THe Summoned heroes, The ministers and the Scouts",
  "dialogues": [
    {
      "id" : 1,
      "actNumber": 1,
      "speaker" : "The King",
      "tone" : "gallant",
      "dialogue" : "My Royal subjects the demon army has risen"
    },
    {
      "id" : 2,
      "actNumber": 1,
      "speaker" : "Everyone in the room",
      "tone" : "shocked",
      "dialogue" : "gasps"
    },
    {
      "id" : 1,
      "actNumber": 1,
      "speaker" : "The King",
      "tone" : "gallant",
      "dialogue" : "Do not fret we have the heroes here to guide us through the battle"
    }
  ]
}
```
``playName`` : This field indicates the name of the play.\
``author`` :  The original author of the play.\
``actNumber`` : The act number from the play.\
``sceneSetting`` : This sets the scene, The location, the mood, the situation.\
``charactersInTheScene`` : This sets the characters in scene.\
``dialogues`` : This is the list of all dialogues that are in the scene/act.\
``dialogues.id`` : gives the sequence in which the dialogues are spoken.\
``dialogues.actNumber`` :  The act number that the dialogues belong to mapping between play and dialogues.\
``dialogues.speaker`` :  The person who says the dialogue.\
``dialogues.tone`` : Sets the tone of the dialogue spoken.\
``dialogues.dialogue`` : the actual dialogue spoken.