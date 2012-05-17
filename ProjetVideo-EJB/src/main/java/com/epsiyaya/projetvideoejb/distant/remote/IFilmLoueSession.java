package com.epsiyaya.projetvideoejb.distant.remote;

import com.epsiyaya.projetvideoejb.metier.model.FilmLoue;
import java.util.Set;
import javax.ejb.Remote;

@Remote
public interface IFilmLoueSession {
    public void getTenLast();
}
