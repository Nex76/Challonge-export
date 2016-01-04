package main;

import challonge.model.Match;
import challonge.model.Participant;
import challonge.request.GetParticipantRequest;
import challonge.request.ListMatchRequest;
import java.util.List;


public class Admin {
    private String api_key;
    private String challonge_link;
    private SBMO.Challonge challonge;
    
    /* BUILDERS */
    
    public Admin(String key, String link){
        setApi_key(key);
        setChallonge_link(link);
        challonge = new SBMO.Challonge(key);
    }

    /* GET SET */
    
    public String getApi_key() {
        return api_key;
    }

    private void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getChallonge_link() {
        return challonge_link;
    }

    private void setChallonge_link(String challonge_link) {
        this.challonge_link = challonge_link;
    }

    /* API */
    public List<Match> listaEnfrentamientos() {
        final ListMatchRequest request = new ListMatchRequest.Builder(this.getChallonge_link()).build();
        final List<Match> matches = challonge.listMatches(request);
        return matches;
    }
    
    public Participant mostrarParticipante(int participantID) {
        final GetParticipantRequest request = new GetParticipantRequest.Builder(this.getChallonge_link(), participantID)
                .build();
        final Participant participant = challonge.getParticipant(request);
        return participant;
    }
    
    /* FUNCTIONS */
    
    public String[] returnNombres(Match e){
        
        String[] s = new String[2];
        
        Participant p1 = mostrarParticipante(e.getPlayerOneId());
        s[0] = p1.getName();
        Participant p2 = mostrarParticipante(e.getPlayerTwoId());
        s[1] = p2.getName();
        
        return s;
    }
    
    public int[] returnResultados(Match e){
        
        int[] r = new int[2];
        
        r[0] = e.getScores().get(0).getPlayerOneScore();
        r[1] = e.getScores().get(0).getPlayerTwoScore();
        
        return r;
    }
    
    public int returnRonda(Match e){
    
        return e.getRound();
    }
    
}
