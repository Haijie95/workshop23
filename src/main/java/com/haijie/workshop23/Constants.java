package com.haijie.workshop23;

public class Constants {
    public static final String selectSQL ="select o.id , o.order_date , o.customer_id,"+
        "sum(d.quantity*d.unit_price)-sum(d.quantity*d.unit_price*discount) total_price,"+
        "sum(d.quantity*p.standard_cost) cost_price "+
        "from orders o "+
        "left join order_details d "+
        "on o.id = d.order_id "+
        "left join products p "+
        "on d.product_id = p.id "+
        "where o.id = ? ";
}
