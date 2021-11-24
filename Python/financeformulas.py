def wacc(debt, equity, cost_of_debt, cost_of_equity, corporate_tax):
    debt_ratio = debt / (debt + equity)
    equity_ratio = equity / (debt + equity)
    return "%.2f" % float(100*((debt_ratio * cost_of_debt * (1 - corporate_tax)) + (equity_ratio * cost_of_equity)))

def r_e(debt, equity, r_0, r_d, t_c):
    debt_to_equity = debt/equity
    return "%.2f" % float(100*(r_0 + (debt_to_equity * (r_0 - r_d) * (1- t_c))))

def v_l(v_u, debt, t_c):
    return "%.2f" % float(v_u + (debt * t_c))

print("WACC: " + wacc(47,53,.09,.1655,0) + "%")

print("r_e: " + r_e(1,1,.14,.06,0) + "%")

print("V_l: " + v_l(24.1, 15, .26))