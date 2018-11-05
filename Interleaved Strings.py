def isInterleave(A, B, C):
    if len(A) == len(B) == len(C) == 0:
        return True
    else:
        return ((len(A) > 0 and len(C) > 0) and A[0] == C[0] and isInterleave(A[1:], B, C[1:])
        or ((len(B) > 0 and len(C) > 0) and B[0] == C[0] and isInterleave(A, B[1:], C[1:])))
