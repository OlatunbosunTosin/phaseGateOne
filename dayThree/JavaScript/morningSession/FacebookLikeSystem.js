function facebookLikes(likes){

    if (likes.length == 0)
        displayText = "no one likes this";
        
    else if (likes.length == 1)
        displayText = `${likes[0]} likes this`;
        
    else if (likes.length == 2)
        displayText = `${likes[0]} and ${likes[1]} like this`;
        
    else if (likes.length == 3)
        displayText = `${likes[0]}, ${likes[1]} and ${likes[2]} like this`;
        
    else if (likes.length == 4)
        displayText = `${likes[0]}, ${likes[1]} and 2 others like this`;
            
 
        
    return display_text
    
}

module.exports = {facebookLikes}
