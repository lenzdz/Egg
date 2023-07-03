/**
 * 
 * This program assumes triangles are isosceles
 * This program assumes pentagons, hexagons, and rhombi are regular
 * 
 */

package actividadextra02_calculadoragrafica;

import Entities.Figure;
import Services.FigureServices;

public class ActividadExtra02_CalculadoraGrafica {

    public static void main(String[] args) {
        
        FigureServices servFigure = new FigureServices();
        Figure fig = servFigure.createFigure();
        
        servFigure.calculatePerimeter(fig);
        servFigure.calculateArea(fig);
        
    }
    
}
