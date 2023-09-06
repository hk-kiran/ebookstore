import socket

host = '127.0.0.1'  
port = 8080  

server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.bind((host, port))

server_socket.listen(5) 

print(f"Listening on {host}:{port}")

while True:
    client_socket, client_address = server_socket.accept()
    
    print(f"Accepted connection from {client_address}")

    data = client_socket.recv(1024)  
    while data:
        print(data.decode('utf-8'), end='')  
        data = client_socket.recv(1024)

    client_socket.close()
