import tkinter as tk

h = 700
w = 800

root = tk.Tk()
canvas=tk.Canvas(root,height=h, width=w)
canvas.pack()

frame = tk.Frame(root, bg="#80c1ff")
frame.place(relx=0.1, rely=0.1, relwidth=0.8,relheight=0.5)

button= tk.Button(frame, text="Text button", bg="gray", fg="red")
button.grid(row=0,column=0)

label = tk.Label(frame, text="Uncico",bg="yellow")
label.pack(side="left", fill="both")

entry= tk.Entry(frame, bg="green")
entry.pack(side='left')

root.mainloop()
