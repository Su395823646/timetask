package com.su.timetask.dao.domain;

public class TotalRoute {
    private Integer id;

    private String routenum;

    private Integer routeId;

    private String startnode;

    private String acrossnode;

    private String endpoint;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoutenum() {
        return routenum;
    }

    public void setRoutenum(String routenum) {
        this.routenum = routenum == null ? null : routenum.trim();
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getStartnode() {
        return startnode;
    }

    public void setStartnode(String startnode) {
        this.startnode = startnode == null ? null : startnode.trim();
    }

    public String getAcrossnode() {
        return acrossnode;
    }

    public void setAcrossnode(String acrossnode) {
        this.acrossnode = acrossnode == null ? null : acrossnode.trim();
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint == null ? null : endpoint.trim();
    }
}