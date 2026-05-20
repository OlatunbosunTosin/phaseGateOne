def facebook_likes(likes):

    if len(likes) is 0:
        display_text = "no one likes this"
        
    elif len(likes) == 1:
        display_text = f"{likes[0]} likes this"
        
    elif len(likes) == 2:
        display_text = f"{likes[0]} and {likes[1]} like this"
        
    elif len(likes) == 3:
        display_text = f"{likes[0]}, {likes[1]} and {likes[2]} like this"
        
    elif len(likes) == 4:
        display_text = f"{likes[0]}, {likes[1]} and 2 others like this"
            
 
        
    return display_text
