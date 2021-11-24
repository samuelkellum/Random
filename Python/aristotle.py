a = []
tiles = []
fill = []
sums = []

def fillfill():
    fill[0] = (a[0] and a[1] and a[2])
    fill[1] = (a[2] and a[3] and a[4])
    fill[2] = (a[4] and a[5] and a[6])
    fill[3] = (a[6] and a[7] and a[8])
    fill[4] = (a[8] and a[9] and a[10])
    fill[5] = (a[10] and a[11] and a[0])
    fill[6] = (a[11] and a[12] and a[13] and a[3])
    fill[7] = (a[9] and a[16] and a[15] and a[5])
    fill[8] = (a[1] and a[13] and a[14] and a[5])
    fill[9] = (a[11] and a[17] and a[16] and a[7])
    fill[10] = (a[1] and a[12] and a[17] and a[9])
    fill[11] = (a[3] and a[14] and a[15] and a[7])
    fill[12] = (a[0] and a[12] and a[18] and a[15] and a[6])
    fill[13] = (a[2] and a[13] and a[18] and a[16] and a[8])
    fill[14] = (a[10] and a[17] and a[18] and a[14] and a[4])

def fillsums():
    sums[0] = (a[0] + a[1] + a[2])
    sums[1] = (a[2] + a[3] + a[4])
    sums[2] = (a[4] + a[5] + a[6])
    sums[3] = (a[6] + a[7] + a[8])
    sums[4] = (a[8] + a[9] + a[10])
    sums[5] = (a[10] + a[11] + a[0])
    sums[6] = (a[11] + a[12] + a[13] + a[3])
    sums[7] = (a[9] + a[16] + a[15] + a[5])
    sums[8] = (a[1] + a[13] + a[14] + a[5])
    sums[9] = (a[11] + a[17] + a[16] + a[7])
    sums[10] = (a[1] + a[12] + a[17] + a[9])
    sums[11] = (a[3] + a[14] + a[15] + a[7])
    sums[12] = (a[0] + a[12] + a[18] + a[15] + a[6])
    sums[13] = (a[2] + a[13] + a[18] + a[16] + a[8])
    sums[14] = (a[10] + a[17] + a[18] + a[14] + a[4])

def test():
    fillfill()
    fillsums()
    for i in range(15):
        result = 1
        result = result and (not fill[i] or sums[i] == 38)
    return result

def assign(i):
    for j in range(20):
        if tiles[j] == -1:
            a[i] = j
            tiles[j] = i
        if (test()):
            if(i == 18):
                print(" %2d %2d %2d\n" % (a[0], a[1], a[2]))
                print(" %2d %2d %2d %2d\n" % (a[11], a[12], a[13], a[3]))
                print("%2d %2d %2d %2d %2d\n" % (a[10], a[17], a[18], a[14], a[4]))
                print(" %2d %2d %2d %2d\n" % (a[9], a[16], a[15], a[5]))
                print(" %2d %2d %2d\n" % (a[8], a[7], a[6]))
                break
            assign(i+1)
            a[i+1] = 0
            tiles[j] = -1
        else:
            a[i] = 0
            tiles[j] = -1



for i in range(19):
    a[i] = 0
    tiles[i+1] = -1

assign(0)


        
