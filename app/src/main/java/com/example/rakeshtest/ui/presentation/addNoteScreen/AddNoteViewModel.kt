
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.rakeshtest.data.models.NoteModel
import com.example.rakeshtest.domain.NoteRepository
import kotlinx.coroutines.launch

class AddNoteViewModel(application: Application) : AndroidViewModel(application) {
    private val noteRepo = NoteRepository(application)

    fun insertNote(noteModel: NoteModel) {
        viewModelScope.launch {
            noteRepo.insertNoteToRoom(noteModel)
        }
    }
}