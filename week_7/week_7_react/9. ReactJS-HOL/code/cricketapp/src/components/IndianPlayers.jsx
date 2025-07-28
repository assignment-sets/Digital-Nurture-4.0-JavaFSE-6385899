export function OddPlayers({ team }) {
  const [first, , third, , fifth] = team;
  return (
    <div>
      <li>First : {first}</li>
      <li>Third : {third}</li>
      <li>Fifth : {fifth}</li>
    </div>
  );
}

export function EvenPlayers({ team }) {
  const [, second, , fourth, , sixth] = team;
  return (
    <div>
      <li>Second : {second}</li>
      <li>Fourth : {fourth}</li>
      <li>Sixth : {sixth}</li>
    </div>
  );
}

export function ListofIndianPlayers({ IndianPlayers }) {
  return (
    <ul>
      {IndianPlayers.map((player, index) => (
        <li key={index}>Mr. {player}</li>
      ))}
    </ul>
  );
}

const IndianPlayers = () => {
  const T20Players = ['First Player', 'Second Player', 'Third Player'];
  const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];

  const mergedIndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

  const IndianTeam = ["Sachin1", "Dhoni2", "Virat3", "Rohit4", "Yuvraj5", "Raina6"];

  return (
    <div>
      <h1>Indian Team</h1>
      <h2>Odd Players</h2>
      <OddPlayers team={IndianTeam} />
      <hr />
      <h2>Even Players</h2>
      <EvenPlayers team={IndianTeam} />
      <hr />
      <h1>List of Indian Players Merged:</h1>
      <ListofIndianPlayers IndianPlayers={mergedIndianPlayers} />
    </div>
  );
};

export default IndianPlayers;
