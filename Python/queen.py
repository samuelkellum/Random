import board

class Queen(board.Piece):

	def __init__(self, color):
		super().__init__(color)


	def validMove(self, board: Board, start: Spot, end: Spot) -> bool:

		# we cannot move to a Spot occupied by a piece of the same color
		if (end.Piece.color == self.color):
			return False

		## CONSIDER ADDING ABOVE TWO AND BELOW TWO LINES OF CODE TO PIECE CLASS
		# calculate how many positions over the piece has moved
		int pos_change = abs(start.pos - end.pos)
		# calculate how many rings the piece has moved
		int ring_change = abs(start.ring - end.ring)

		'''there are two cases to look at for a piece that can move diagonally

                1. if the piece does not cross the center
                2. if the piece crosses the center
                '''

		
                ##1. if the piece does not cross the center
                #if the ring change equals the position change, the piece will move diagonally
		#(but ring change must be greater than 0 because the piece must move)
		if (ring_change == pos_change) and ring_change > 0:
                        return True

                ##2. if the piece crosses the center
                '''lmao I wrote a shit ton of if statements then noticed this pattern for the valid move
                for pieces that cross the gay ass center'''
                if start.ring > 0:
                        if start.ring == pos_change - end.ring:
                                return True

                '''for pieces that can move horizontally, either the ring or position must remain the same
                while the piece is moving
                '''

                        if (start.ring == finish.ring) or (start.pos == end.pos):
                                return True
                return False
