package gameresources.pattern.sequencing.double_buffer.v3_with_actors_not_working;

import org.junit.jupiter.api.Test;

class Example {
    @Test
    public void works_as_expected() {
        Stage stage = new Stage();
        Comedian harry = new Comedian("harry");
        Comedian baldy = new Comedian("baldy");
        Comedian chump = new Comedian("chump");
        harry.face(baldy);
        baldy.face(chump);
        chump.face(harry);
        stage.add(harry, 0);
        stage.add(baldy, 1);
        stage.add(chump, 2);

        harry.slap();
        stage.update();
    }

    @Test
    public void doesnt_work_as_expected() {
        Stage stage = new Stage();
        Comedian harry = new Comedian("harry");
        Comedian baldy = new Comedian("baldy");
        Comedian chump = new Comedian("chump");
        harry.face(baldy);
        baldy.face(chump);
        chump.face(harry);
        stage.add(harry, 2);
        stage.add(baldy, 1);
        stage.add(chump, 0);

        harry.slap();
        stage.update();
    }
}
