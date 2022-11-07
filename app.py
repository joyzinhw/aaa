import tweepy 

api = tweepy.Cliente(
      consumer_key = 'uBZqarVMGB1tstaoBVuJj0eCS',
      consumer_key = '1F5MGHJyDuEo0b0lopj7n1YdaUABBL3veej8piK4R5sJokzweR',
      access_token = '832408656801062912-qLAill0EPZJCS53jcDOEYXhIaZB8DEU',
      access_token_secret = 'iRV2XtMuuZ1gPSJLjNirKiu7xt0h2XOWwwT9Kb6hBJxvA'

)

try:
	
 tweet = api.creator_tweet(text="sim!")
    print(tweet)
    
    except:
    	print("tenso")