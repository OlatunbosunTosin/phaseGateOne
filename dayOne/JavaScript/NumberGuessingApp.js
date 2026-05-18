import Random;

const prompt = require("prompt-sync")();

        let count = 0;
        while (true){
        
            let randomNumber = Math.floor(Math.Random() * 100 + 1) 
            let userNumber = Number(prompt("Enter a number: "));
    
            if(userNumber < 1 || userNumber > 100)
                console.log("only numbers between 1 and 100");
            else
                count += 1;
        
            while(count < 5){
                
                if (userNumber > randomNumber)
                    console.log("Answer is lower");
                    
                if (userNumber < randomNumber)
                    console.log("Answer is higher");   

                userNumber = Number(prompt("Enter a number: "));
                
                if(userNumber < 1 || userNumber > 100)
                    console.log("only numbers between 1 and 100");
                else
                    count += 1;
            }
            
                   
                
        if (userNumber == randomNumber)
            console.log("Correct"); 
        
        if (count == 1)
            console.log("Rating is Legendary");   
        else if (count == 2)
            console.log("Rating is Excellent");
        else if (count == 3 || count == 4)
            console.log("Rating is Good");
        else if (count == 5)
            console.log("Rating is Close!") ;
            
        if (userNumber != randomNumber)
            console.log("Better luck") ; 
        
        console.log(`Correct number is ${randomNumber}, you made ${count} attempts`);
        break;

        }      
        
    }

}
    
