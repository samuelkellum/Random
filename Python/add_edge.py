G={ "s" : ["t","y"],  "t" : ["s","x"],"y" : ["s","x","z"], "x" : ["t","y","z"], "z" : ["x","y"] }
def add_edge(graph, a, b):
    graph[a].append(b)

