
package com.antonicastejon.model.repository.entities.base;

import com.antonicastejon.model.repository.entities.user.Info;

import java.util.List;

public class RepositoryResponse<T> {

    private List<T> results = null;
    private Info info;

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
