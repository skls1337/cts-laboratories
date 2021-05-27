package ro.ase.csie.cts.assignment3;

import ro.ase.csie.cts.assignment3.exceptions.ServerException;

public interface ServerInterface {

    public String getIpAddress();
    public int getPort();
    public int getMaxConnections();

    public boolean connect() throws ServerException;
    public boolean disconnect() throws ServerException;

}