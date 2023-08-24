package ejercicioextra04_identitydoc;

import Entities.Identifier;
import Services.IdentifierServices;

public class EjercicioExtra04_IdentityDoc {

    public static void main(String[] args) {
        
        IdentifierServices servIdentifier = new IdentifierServices();
        Identifier id = servIdentifier.createId();
        
        servIdentifier.showId(id);
        
    }
    
}
