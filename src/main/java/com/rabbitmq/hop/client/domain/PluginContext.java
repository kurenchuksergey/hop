package com.rabbitmq.hop.client.domain;

@SuppressWarnings("unused")
public class PluginContext {
  private String node;
  private String description;
  private String path;
  private int port;
  private boolean ssl;

  public String getNode() {
    return node;
  }

  public void setNode(String node) {
    this.node = node;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public boolean isSsl() {
    return ssl;
  }

  public void setSsl(boolean ssl) {
    this.ssl = ssl;
  }

  @Override
  public String toString() {
    return "PluginContext{" +
        "node='" + node + '\'' +
        ", description='" + description + '\'' +
        ", path='" + path + '\'' +
        ", port=" + port +
        '}';
  }
}