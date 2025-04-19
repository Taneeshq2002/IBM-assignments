#create a secret file
touch secret

#set owner to root
chown root:root secret

#Set permission only for root
chmod 700 secret

#grant access to deepak
setfacl -m u:deepak:rwx secret

#show list of users
ls -l secret
getfacl secret
