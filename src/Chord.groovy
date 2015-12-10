
class Chord extends ArrayList<Note> {
    Chord(String notes) {

        ArrayList<Note> notesList = notes
                .split(',')
                .collect({ new Note(it) })
        ;

        this.addAll notesList
    }

    Chord(ArrayList<Note> notes) {
        this.notes = notes;
    }

    String toString() {
        collect({ it.toString() }).join(',');
    }
}
