# Daniel Day-Lewis Quotinator 

Test Rest service using spring boot to generate Daniel Day-Lewis movie quotes.

## Use

To run the program, execute the `com.jvn.Application` class' main function.

Once the webapp starts navigate to `http://localhost:8080/daniel-day-lewis-quotinator`.

You should receive a response that resembles:

```json
{"id":1,"quote":"I drink your Milkshake! I drink it up!"}
```

You can also add a noun parameter, like so `http://localhost:8080/daniel-day-lewis-quotinator?noun=cow`

Which will generate a response that resembles:

```json
{"id":2,"quote":"I drink your cow! I drink it up!"}
```